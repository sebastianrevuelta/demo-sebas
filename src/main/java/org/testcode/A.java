package org.testcode;

import javax.servlet.http.HttpServletResponse;

public class A {

    public void suspiciousCall(java.sql.Statement statement, String sql, HttpServletResponse response) throws java.sql.SQLException {
        int count = statement.executeUpdate(sql);
        org.owasp.benchmark.helpers.DatabaseHelper.outputUpdateComplete(sql, response);
    }

}