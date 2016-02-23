package com.dianrong.common.uniauth.client.support;

import javax.servlet.http.HttpServletRequest;

public class ExtractRequestUrl {

	private ExtractRequestUrl(){}
	
	public static String extractRequestUrl(HttpServletRequest request){
		String url = request.getServletPath();
		String pathInfo = request.getPathInfo();
		String query = request.getQueryString();

		if (pathInfo != null || query != null) {
			StringBuilder sb = new StringBuilder(url);

			if (pathInfo != null) {
				sb.append(pathInfo);
			}

			if (query != null) {
				sb.append('?').append(query);
			}
			url = sb.toString();
		}
		return url;
	}
}
