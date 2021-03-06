package com.revature.BanksofBanks.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
public class Authable {
    static boolean checkAuth(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession httpSession = req.getSession();
        if(httpSession.getAttribute("authAccountOwner") == null){
            resp.getWriter().write("Unauthorized request - not log in as registered account owner");
            resp.setStatus(401); // Unauthorized
            return false;
        }
        return true;
    }
}
