package com.myProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/loginPage.do")
public class LoginServlet extends HttpServlet implements Runnable{
	//private UserValidationService service = new UserValidationService();
	
	long lastprime = 0;                    
	  Date lastprimeModified = new Date(lastprime);   
	  Thread searcher;

	  public void init() throws ServletException {
	    searcher = new Thread(this);
	    searcher.setPriority(Thread.MIN_PRIORITY);
	    searcher.start();
	    System.out.println("Thread started in servlet");
	  }

	  public void run() {
	  }
	  public void destroy() {
		    searcher.stop();
		  }
	
	
	
	static String userEmail=null;
	static String[] book = null;
	static String[] author = null;
	static int[] price = null;
	static int i;
	
	public static void setBookName() throws SQLException{
		 MyDatabaseHandler md = new MyDatabaseHandler();
	     md.setConnection();
	     ResultSet a = md.testQuery("books");
		 book = new String[50];
		 price = new int[50];
		 author = new String[50];
		 i=0;
		 while(a.next()){
			 book[i] = a.getString("Title");
			 price[i] = a.getInt("Price");
			 author[i] = a.getString("author");
			 i++;
		 }
		 
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
        MyDatabaseHandler md = new MyDatabaseHandler();
        md.setConnection();
		
		System.out.println("thread in doGet");
		//init();
	    resp.setContentType("text/plain");
	    //PrintWriter out = resp.getWriter();
	    if (lastprime == 0) {
	      System.out.println("Still searching for first prime...");
	    }
	    else {
	      System.out.println("The last prime discovered was " + lastprime);
	      System.out.println(" at " + lastprimeModified);
	    }
		
		

		String temp = req.getParameter("buy");
		System.out.println(temp);
		
		String bookA = req.getParameter("bookA");
		String priceA = req.getParameter("priceA");
		String yearA = req.getParameter("yearA");
		String publisherA = req.getParameter("publisherA");
		String authorA = req.getParameter("authorA");
		String buttonA = req.getParameter("buttonA");
		System.out.println(bookA+priceA+yearA+publisherA+authorA+buttonA+"-------------------");
		
		if(buttonA!=null && buttonA.equals("button")){
			md.insertData2("books",bookA,priceA,yearA,publisherA,authorA);
		}
		
		
		
		String cart=req.getParameter("cart");
		String data1=req.getParameter("data1");
		String data2=req.getParameter("data2");
		String data3=req.getParameter("data3");
		String data4=req.getParameter("data4");
		String data5=req.getParameter("data5");
		String data6=req.getParameter("data6");
		String data7=req.getParameter("data7");
		String data8=req.getParameter("data8");
		String data9=req.getParameter("data9");
		String data10=req.getParameter("data10");
		req.setAttribute("userMail", userEmail);
		System.out.println(data9+data10+" is saved in get");
	    //do processing on datas pass in other java class to add to DB
	    // i am adding or concatenate
	    //String data="i Got : "+"'"+data1+"' ";
	    System.out.println(" data1 : "+data1+" data2 : "+data2+" data3 : "+data3+" data4 : "+data4);
	    System.out.println("------data5 : "+data5+" data6 : "+data6+" data7 : "+data7+" data8 : "+data8);
        if(data4!=null){
        	md.insertData(data1,userEmail,"shoppincart");
        	System.out.println("Insert Done");
        }else if(data10!=null){
        	try {
				md.delete2(data9, "books");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Delete done");
        }else if(data8!=null){
        	try{
				md.delete(data5, userEmail,"shoppincart");
				System.out.println("Delete done");
	        }catch(SQLException e){
	        	e.printStackTrace();
	        }
        }
		
		
		//System.out.println(cart);
		//if(a=="Crate")
        if(cart!=null && cart.equals("cart")){
        	req.getRequestDispatcher("newView/cart.jsp").forward(req, resp);
        }else if(buttonA!=null && buttonA.equals("button")){
			req.getRequestDispatcher("/newView/admin.jsp").forward(req, resp);
        }else{
        	req.getRequestDispatcher("newView/loginPage.jsp").forward(req, resp);
        }
}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Thread in doPost");
	    //Runnable r = new Runnable() {
	    //	public void run(){}
	    //	};
		String name = req.getParameter("email");
		userEmail=name;
		System.out.println(userEmail+" is the saved email");
		req.setAttribute("userMail", userEmail);
		String password = req.getParameter("password");
		String submit = req.getParameter("submit");
		String varify = req.getParameter("pageName");
		
		
		if(varify!=null && varify.equals("loginPage")){
	        MyDatabaseHandler md = new MyDatabaseHandler();
	        md.setConnection();
	        md.insertData(name,password,"customer");
		}

		
		try {
			setBookName();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int j =0; j<i;j++){
			req.setAttribute("title"+j, book[j]);
			req.setAttribute("author"+j, author[j]);
			req.setAttribute("price"+j, price[j]);
		}
		
		
		if(submit!=null && submit.equals("submit") && name.equals("admin@gmail.com") && password.equals("admin")){
			req.getRequestDispatcher("/newView/admin.jsp").forward(req, resp);
		}else if(submit!=null && submit.equals("submit")){
			req.getRequestDispatcher("/newView/welcome.jsp").forward(req, resp);
		}
		//else if(cart!=null && cart.equals("cart")){
		//	req.getRequestDispatcher("newView/cart.jsp").forward(req, resp);
		//}
	}
}

//}
