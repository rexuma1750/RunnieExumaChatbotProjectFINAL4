package com.company;

public class Chatbot {

    int emotion = 0;

    public void chatLoop(String statement){
        Scanner in = new Scanner (System.in);
        System.out.println(getGreeting());

        while (!statement.equals("Bye")){
            statement = in.nextLine();
            System.out.println(getResponse(statement));

        }
    }
    public String getGreeting() {
        return "Hi there! My name is Lorraine, and I am here to help you navigate the 2018 U.S. Midterm Elections.Do you have any questions?";
    }

    public String getResponse( String statement){
        String response = "";
        if (statement.length() == 0) {
            response = " Please type in your question.";
            emotion++;
        }
        else if ((findKeyword(statement, "New York") >= 0)
                || (findKeyword(statement, "Brooklyn") >= 0)
                || (findKeyword(statement, "Manhattan") >= 0)
                || (findKeyword(statement, "Bronx") >= 0)
                || (findKeyword(statement, "Staten Island") >= 0))
        {
            response = " The two candidates for U.S. Senate in New York are Kirsten Gillibrand(D), and Chele Farley(R). ";
            emotion++;

        }
        else if (findKeyword(statement,"Democrats") >= 0
                || findKeyword(statement,"Republicans") >= 0
                || findKeyword(statement,"Independent") >=0
                || findKeyword(statement, "House") >= 0)
        {
            response = "Democrats regained control in the House of Representatives. There are currently 232 Democrats in the House, along with 197 Republicans.";
            emotion++;
        }
        else if (findKeyword (statement, "vote") >= 0
            || findKeyword(statement,"Registration") >= 0
            || findKeyword(statement,"polls") >= 0
            || findKeyword(statement,"booth") >= 0
            || findKeyword(statement,"voting") >= 0)
        {
            response = "The last day to vote in New York is November 6th,2018. Please visit the nyc.pollsite.locator.com website to gain information on where to vote.";
            emotion++;
        }
    }


    private String transformIWantToStatement(String statement){
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")){
            statement == statement.substring.(0, statement.length() - 1);
        }
        int psn = findKeyword (statement,"I want to");
        String restOfStatement = statement.substring(psn +9).trim();
        return "Why do you want to" + restOfStatement + "?";
    }

    private int findKeyword(String statement,.String goal){
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();
        int psn = phrase.indexOf(goal, startPos);

        while (psn >= 0){
            String before = " ", after = " ";
            if (psn > 0){
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length()){
                after = phrase.substring(
                        psn +goal.length(),
                        psn + goal.length() + 1);

            }
            if (((before.compareTo("a") < 0 || (before.compareTo("z") >0))) && ((after.compareTo("a" < 0 || (after.compareTo("z" > 0))){
                return psn;
            }
            psn = phrase.indexOf(goal, psn +1);
        }
        return -1;

        private String getRandomResponse(;){
            Random r = new Random();
            if (emotion < 0) {
                return randomNeutralResponse[r.nextInt(randomNeutralResponses.length)];

            }
        }
            private String[] randomNeutralResponses; -{" Hmm, I'm not sure what you're asking.",
                    " Google this question. I'm not sure I can help!",
                    "Could you say that again?";
            }

    }
}
