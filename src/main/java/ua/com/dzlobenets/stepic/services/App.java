/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ua.com.dzlobenets.stepic.services;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;

public class App {
	public static void main(String[] args) throws Exception {
		final HttpServlet simpleServlet = new Frontend();

		final ServletContextHandler servletContextHandler = new ServletContextHandler();
		servletContextHandler.addServlet(new ServletHolder(simpleServlet), "/test");

		final Server server = new Server(8080);
		server.setHandler(servletContextHandler);

		server.start();
		server.join();
		// add shutdown hook
    }
}
