package com.minimatash.servlets.fileWork;

import com.minimatash.fileStructure.FileWork;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@MultipartConfig
public class UploadFileServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            Part fileName = request.getPart("file");
            String currentLocation = request.getParameter("currentLocation").substring(5);
            String path = request.getSession().getAttribute("homePath") + currentLocation + "/" + fileName;
            String result = FileWork.createFolder(path);
            response.getWriter().write(result);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
}
