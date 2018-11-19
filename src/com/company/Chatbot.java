package com.company;

public class Chatbot {
    public String getGreeting() {
        return "Hi there! My name is Lorraine, and I am here to help you navigate the 2018 U.S. Midterm Elections.Do you have any questions?";
    }

    public String getResponse( String statement){
        String response = "";
        if (statement.length() == 0) {
            response = " Please type in your question.";
        }
        else if (findKeyword(statement, "New York") >= 0
                || findKeyword(statement,"Brooklyn") >= 0
                || findKeyword(statement,"Manhattan") >= 0
                || findKeyword(statement,"Bronx") >= 0
                || findKeyword(statement,"Staten Island") >= 0
        {
            response = " The two candidates for U.S. Senate in New York are Kirsten Gillibrand(D), and Chele Farley(R). ";

        }
        else if (findKeyword(statement,"Democrats") >= 0
                || findKeyword(statement,"Republicans") >= 0
                || findKeyword(statement,"Independent") >=0
                || findKeyword(statement, "House") >= 0
        {
            response = "Democrats regained control in the House of Representatives. There are currently 232 Democrats in the House, along with 197 Republicans.";
        }
        else if (findKeyword (statement, "vote") >= 0
            || findKeyword(statement,"Registration") >= 0
            || findKeyword(statement,"polls") >= 0
            || findKeyword(statement,"booth") >= 0
            || findKeyword(statement,"voting") >= 0
        {
            response = "The last day to vote in New York is November 6th,2018. Please visit the nyc.pollsite.locator.com website to gain information on where to vote.";
        }
    }
}
