package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.pet.adoption.entities.About;
import com.pet.adoption.dao.AboutDao;
import com.pet.adoption.DB.ConnectionProvider;

public final class About_0026Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <link rel=\"icon\" href=\"/images/1.png\"\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background {\n");
      out.write("         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:#a1ff52;\">\n");
      out.write("        <!-- navbar -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand text-white\" href=\"#\">PetAdoption</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"listAbout\">About Us</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"#\">Contact Us</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" href=\"#\">Main Page</a>\n");
      out.write("        </li><!-- comment -->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link text-white\" href=\"#\">Articles</a>\n");
      out.write("        </li>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\">\n");
      out.write("        <a class=\"nav-link text-white\" href=\"#!\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>&nbsp;&nbsp;  \n");
      out.write("        </a>>\n");
      out.write("        <a class=\"nav-link text-white\" href=\"AdminLogoutServlet\"><span class=\"\"></span>LOGOUT</a>\n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*, *:before, *:after {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 33.3%;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("  margin: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".about-section {\n");
      out.write("  padding: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: #474e5d;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container::after, .row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  border: none;\n");
      out.write("  outline: 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 8px;\n");
      out.write("  color: white;\n");
      out.write("  background-color: #000;\n");
      out.write("  text-align: center;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("  background-color: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 650px) {\n");
      out.write("  .column {\n");
      out.write("    width: 100%;\n");
      out.write("    display: block;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
 

AboutDao pd = new AboutDao();
List<About> about = pd.selectAllAbout();

      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"about-section\">\n");
      out.write("  <h1>About Us Page</h1>\n");
      out.write("   ");

                                          if(!about.isEmpty()) { 
                                          for (About p:about) {
                                     
      out.write("\n");
      out.write("                                     \n");
      out.write("                                     <div class=\"col-md-3 my-3 \">\n");
      out.write("            <div class=\"card w-1000\" style=\"width: 50rem; align-content:center; margin-left:23%; \">\n");
      out.write("         \n");
      out.write(" \n");
      out.write("                <div class=\"card-body\" style=\"background-color:white; height:200px; color:black; text-align:justify-all\" >\n");
      out.write("        \n");
      out.write("                    <p>");
      out.print(p.getDetails());
      out.write("</p>\n");
      out.write("    \n");
      out.write("          \n");
      out.write("   <div class=\"mt-3 d-flex justify-content-between\">\n");
      out.write("           \n");
      out.write("         \n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("  \n");
      out.write("            \n");
      out.write("           </div>\n");
      out.write("           </div> \n");
      out.write("          \n");
      out.write("          \n");
      out.write("           \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("    ");
     
              }       
                }
      
      out.write(" \n");
      out.write("<h2 style=\"text-align:center\">Contact</h2>\n");
      out.write("<div class=\"row\">\n");
      out.write(" \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("            \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
