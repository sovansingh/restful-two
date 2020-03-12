package org.sathyatech.com.provider;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("/product")
public class ProductResource {

	@GET
	@Path("/get")
	public String getData(
			@Context HttpServletRequest req,
			@Context ResourceInfo info,
			@Context UriInfo uri,
			@Context HttpHeaders header
			) {
		
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println("-----------------");
		System.out.println(info.getResourceMethod().getName());
		System.out.println(info.getResourceMethod().getAnnotations()[0]);
		System.out.println(info.getResourceMethod().getAnnotations()[1]);
		System.out.println("-------------------");
		System.out.println(uri.getPath());
		System.out.println(uri.getAbsolutePath());
		System.out.println(uri.getBaseUri());
		System.out.println(uri.getPathParameters());
		System.out.println(uri.getQueryParameters());
		System.out.println(uri.getPathSegments());
		System.out.println("-------------------");
		System.out.println(header.getLength());
		System.out.println(header.getMediaType());
		System.out.println(header.getCookies());
		System.out.println(header.getAcceptableMediaTypes());
		
		return "Got It!!!!";
	}
}
