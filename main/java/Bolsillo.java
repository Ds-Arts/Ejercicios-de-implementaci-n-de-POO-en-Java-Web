import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bosillo.Daviplata;
import bosillo.Nequi;

public class Bolsillo extends HttpServlet{
    Nequi N = new Nequi();
    Daviplata D = new Daviplata();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            //redirecciona con el req
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;

            case "loginN":
            //redirecciona con el req
            req.getRequestDispatcher("loginN.jsp").forward(req, resp);
            break;
            case "loginD":
            //redirecciona con el req
            req.getRequestDispatcher("loginD.jsp").forward(req, resp);
            break;
            case "dashboard":
            //redirecciona con el req
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
            break;
            case "dashboardD":
            //redirecciona con el req
            req.getRequestDispatcher("dashboardD.jsp").forward(req, resp);
            break;
            case "Nosotros":
            //redirecciona con el req
            req.getRequestDispatcher("Nosotros.jsp").forward(req, resp);
            break;
            case "Nrecargar":
            //redirecciona con el req
            req.getRequestDispatcher("Nrecargar.jsp").forward(req, resp);
            break;
            case "Nretirar":
            //redirecciona con el req
            req.getRequestDispatcher("Nretirar.jsp").forward(req, resp);
            break;
            case "Nconsultar":
            //redirecciona con el req
            req.setAttribute("saldoTotal",N.consultarSaldo() );
            req.getRequestDispatcher("Nconsultar.jsp").forward(req, resp);
            
            break;
            case "Drecargar":
            //redirecciona con el req
            req.getRequestDispatcher("Drecargar.jsp").forward(req, resp);
            break;
            case "Dretirar":
            //redirecciona con el req
            req.getRequestDispatcher("Dretirar.jsp").forward(req, resp);
            break;
            case "Dconsultar":
            //redirecciona con el req
            req.setAttribute("saldoTotal",D.consultarSaldo() );
            req.getRequestDispatcher("Dconsultar.jsp").forward(req, resp);
            break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String accion=req.getParameter("accion");
        System.out.println(accion);
            switch(accion){
                case "recargar":
                int E=Integer.parseInt(req.getParameter("recarga"));
                N.setRecarga(E);

                req.setAttribute("saldoTotal", D.recargarSaldo());
                    req.getRequestDispatcher("Dconsultar.jsp").forward(req, resp);
                break;
                case "retirar":
                int H=Integer.parseInt(req.getParameter("recarga"));
                N.setRecarga(H);

                req.setAttribute("saldoTotal", D.retirarSaldo());
    
                req.getRequestDispatcher("Dconsultar.jsp").forward(req, resp);
                break;
                case "consulta":
                int a=Integer.parseInt(req.getParameter("consultar"));
                N.setSaldoActual(a);
                req.getRequestDispatcher("Dconsultar.jsp").forward(req, resp);
                break;
                case "Nrecargar":
                int I=Integer.parseInt(req.getParameter("recarga"));
                N.setRecarga(I);
                req.setAttribute("saldoTotal", N.recargarSaldo());
    
                  
                    req.getRequestDispatcher("Nconsultar.jsp").forward(req, resp);
                break;
                case "Nretirar":
                int A=Integer.parseInt(req.getParameter("retira"));
                N.setRetira(A);
                    req.setAttribute("saldoTotal", N.retirarSaldo());

              
                req.getRequestDispatcher("Nconsultar.jsp").forward(req, resp);
            break;
            case "Nconsulta":
                int c=Integer.parseInt(req.getParameter("consulta"));
                N.setSaldoActual(c);
                req.getRequestDispatcher("Nconsultar.jsp").forward(req, resp);
                break;
                
            }
    }
    
}
