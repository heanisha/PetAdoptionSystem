package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pet.adoption.entities.Admin;

public final class Adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    


Admin admin=(Admin)session.getAttribute("currentUser");

if (admin==null){
    response.sendRedirect("adminLogin_page.jsp");
}





      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>PetAdoption</title>\n");
      out.write("        <link rel=\"icon\" href=\"/images/1.png\"\"/>\n");
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
      out.write("        <a class=\"nav-link text-white\" href=\"#!\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>&nbsp;&nbsp;");
      out.print(admin.getAdminName());
      out.write("  \n");
      out.write("        </a>>\n");
      out.write("        <a class=\"nav-link text-white\" href=\"AdminLogoutServlet\"><span class=\"\"></span>LOGOUT</a>\n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <!-- end of nav bar -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--profile modal-->\n");
      out.write("\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("<!--<button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">");
      out.print(admin.getAdminName());
      out.write("\n");
      out.write("  Launch demo modal\n");
      out.write("</button>-->\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header text-white text-center\" style=\"background-color:#1c1d1b;\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">PetAdoption</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close bg-light\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("      <div class=\"container text-center\"  \n");
      out.write("           <h5 class=\"modal-title text-center\" id=\"exampleModalLabel\">");
      out.print(admin.getAdminName());
      out.write("</h5>\n");
      out.write("      \n");
      out.write("      <!--details-->\n");
      out.write("      \n");
      out.write("      <div id=\"profile-details\">\n");
      out.write("      \n");
      out.write("      <table class=\"table\">\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("      <tr>\n");
      out.write("  <img src=\"img/profile_img.jpg\" alt=\"\" width=\"100px\" height=\"100px\"/>\n");
      out.write("    </tr>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Admin ID</th>\n");
      out.write("      <td>");
      out.print(admin.getAdminId());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Admin Name</th>\n");
      out.write("      <td>");
      out.print(admin.getAdminName());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Email</th>\n");
      out.write("      <td>");
      out.print(admin.getAdminEmail());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Phone No</th>\n");
      out.write("       <td>");
      out.print(admin.getAdminPhoneNo());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Password</th>\n");
      out.write("       <td>");
      out.print(admin.getAdminPassword());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("       <!--profile-edit-->\n");
      out.write("       \n");
      out.write("       <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("           \n");
      out.write("           <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("           <form action=\"AdminEditServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("               \n");
      out.write("               <table class=\"table\">\n");
      out.write("                   \n");
      out.write("                         <tr>\n");
      out.write("                            <img src=\"img/profile_img.jpg\" alt=\"\" width=\"100px\" height=\"100px\"/>\n");
      out.write("                         </tr>\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                       <td>Admin ID</td>  \n");
      out.write("                       <td>");
      out.print(admin.getAdminId());
      out.write("</td> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                       <td>Admin Email</td>  \n");
      out.write("                       <td>");
      out.print(admin.getAdminEmail());
      out.write("</td> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                       <td>Name</td>  \n");
      out.write("                       <td><input type=\"text\" class=\"form-control\" name=\"adminName\" value=\"");
      out.print(admin.getAdminName());
      out.write("\"</td> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                     <tr>\n");
      out.write("                       <td>Phone</td>  \n");
      out.write("                       <td><input type=\"text\" class=\"form-control\" name=\"adminPhoneNo\" value=\"");
      out.print(admin.getAdminPhoneNo());
      out.write("\"</td> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                     <tr>\n");
      out.write("                       <td>Password</td>  \n");
      out.write("                       <td><input type=\"text\" class=\"form-control\" name=\"adminPassword\" value=\"");
      out.print(admin.getAdminPassword());
      out.write("\"</td> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("               </table>\n");
      out.write("                   \n");
      out.write("                   <div class=\"container\">\n");
      out.write("                       <button type=\"submit\" class=\"btn text-white\" style=\"background-color:#1c1d1b;\">Save</button>\n");
      out.write("                   </div>\n");
      out.write("           </form>\n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("        <button  id=\"edit-profile-button\" type=\"button\" class=\"btn text-white\" style=\"background-color:#1c1d1b;\">Edit</button>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"AdminDeleteServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("           <!--  <button class=\"btn\" style=\"background-color:#1c1d1b;\"><a href=\"AdminDeleteServlet?=id\" style=\"color:white;\">DELETE</a></button>-->\n");
      out.write(" <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#delete-modal\" style=\"background-color:#1c1d1b;\">Delete</button>\n");
      out.write("\n");
      out.write("</button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("       </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                <!-- to create delete alert box using modal toggle -->\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"delete-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"background-color:#1c1d1b;\">\n");
      out.write("        <h5 class=\"modal-title text-white\" id=\"exampleModalLabel\">Delete Confirmation</h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close bg-light\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\" style=\"background-color:#a1ff52;\">\n");
      out.write("       Are you sure you want to delete your Account?\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\" style=\"background-color:#a1ff52;\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">No</button>\n");
      out.write("        <form action=\"AdminDeleteServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <button class=\"btn\" style=\"background-color:#1c1d1b;\"><a href=\"AdminDeleteServlet?=id\" style=\"color:white;\">YES</a></button>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("       </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("       <!--end of profile modal--> \n");
      out.write("       \n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("  integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    $(document).ready(function () {\n");
      out.write("        let editStatus = false;\n");
      out.write("        \n");
      out.write("\n");
      out.write("         $('#edit-profile-button').click(function() \n");
      out.write("         {\n");
      out.write("             //alert(\"button clicked\")\n");
      out.write("             \n");
      out.write("          if(editStatus == false) \n");
      out.write("          {\n");
      out.write("          $(\"#profile-details\").hide()\n");
      out.write("             \n");
      out.write("          $(\"#profile-edit\").show()\n");
      out.write("          editStatus=true;\n");
      out.write("          $(this).text(\"Back\")\n");
      out.write("          \n");
      out.write("             }else\n");
      out.write("             {\n");
      out.write("          \n");
      out.write("            $(\"#profile-details\").show()\n");
      out.write("             \n");
      out.write("          $(\"#profile-edit\").hide()\n");
      out.write("         editStatus=false;\n");
      out.write("          $(this).text(\"Edit\")\n");
      out.write("             }\n");
      out.write("         });\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
