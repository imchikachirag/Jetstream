package com.force.sdk.streaming.server;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author naamannewbold
 */
public class PushTopicServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.getPathInfo().split("/");
        BufferedReader reader = req.getReader();
        PrintWriter writer = new PrintWriter(res.getOutputStream());
        String l;
        while ((l = reader.readLine()) != null) {
            writer.write(l);
        }

        writer.write(
                "Context Path: " + req.getContextPath()
                        + "\nPath Info: " + req.getPathInfo()
        );
        writer.flush();
    }
}
