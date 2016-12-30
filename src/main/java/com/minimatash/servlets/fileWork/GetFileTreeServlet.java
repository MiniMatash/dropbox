package com.minimatash.servlets.fileWork;

import com.google.gson.Gson;
import com.minimatash.fileStructure.FileWork;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GetFileTreeServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Map<String,String>> files;
            String path = "/home/" + System.getProperty("user.name") + "/dropbox/" + request.getSession().getAttribute("login");
            if(FileWork.checkExistence(path+request.getParameter("path").substring(5))) {
                if (!request.getParameter("path").equals("/home")) {
                    files = FileWork.getFileTree(path + request.getParameter("path").substring(5));
                } else {
                    files = FileWork.getFileTree(path);
                }
                String json = new Gson().toJson(files);
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write(json);
            }else{
                response.sendRedirect("/");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
