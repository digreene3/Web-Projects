package flashcards.boundary;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flashcards.logic.FCLogic;
import flashcards.object.Deck;
import flashcards.object.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * The cfg.
	 *
	 * @see HttpServlet#HttpServlet()
	 */

	/** The cfg. */
	Configuration cfg = null;

	/** The template dir. */
	private String templateDir = "/WEB-INF/templates";

	/** The user. */
	private User user;
	FCLogic fcl = new FCLogic();

	public void init() {
		cfg = new Configuration(Configuration.VERSION_2_3_25);
		cfg.setServletContextForTemplateLoading(getServletContext(), templateDir);
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		String button = request.getParameter("button");
		if (button != null) {
			if (button.equals("register")) {
				RequestDispatcher view = request.getRequestDispatcher("html/registration.html");
				view.forward(request, response);
			}

			if (button.equals("login")) {
				RequestDispatcher view = request.getRequestDispatcher("../html/login.html");
				view.forward(request, response);
			}
			if (button.equals("LOGIN")) {
				loadMainPage(request, response);
			}
			if (button.equals("+")) {
				newSet(request, response);
			}
			if (button.equals("Create Set")) {
				loadMainAfterNewSet(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void loadMainPage(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> root = new HashMap<String, Object>();
		ArrayList<Deck> decks = fcl.getDecks();

		root.put("decks", decks);
		Template temp = null;
		try {
			String templateName = "main.ftlh";
			temp = cfg.getTemplate(templateName);
			response.setContentType("text/html");
			Writer out = response.getWriter();
			temp.process(root, out);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	private void newSet(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> root = new HashMap<String, Object>();
		// root.put(arg0, arg1)

		Template temp = null;
		try {
			String templateName = "newSet.ftlh";
			temp = cfg.getTemplate(templateName);
			response.setContentType("text/html");
			Writer out = response.getWriter();
			temp.process(root, out);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	private void loadMainAfterNewSet(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> root = new HashMap<String, Object>();
		// root.put(arg0, arg1)
		String topic = request.getParameter("topic");
		String color = request.getParameter("colorTxt");
		fcl = new FCLogic();
		fcl.createNewSet(topic,color);
		ArrayList<Deck> decks = fcl.getDecks();
		
		root.put("decks", decks);	
		Template temp = null;
		try {
			String templateName = "main2.ftlh";
			temp = cfg.getTemplate(templateName);
			response.setContentType("text/html");
			Writer out = response.getWriter();
			temp.process(root, out);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
