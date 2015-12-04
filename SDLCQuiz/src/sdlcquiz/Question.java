/**
 * Nick & Nano Thursday, December 3, 2015 Question object made for easy
 * implementation of 4 question M/C tests.
 */
package sdlcquiz;

public class Question {

    private String correct;
    private String[] incorrect;

    public Question(String correct, String inc1, String inc2, String inc3) {
        this.correct = correct;
        incorrect = new String[3];
        incorrect[0] = inc1;
        incorrect[1] = inc2;
        incorrect[2] = inc3;
    }

    public Question(String correct, String[] incorrect) {
        this(correct, incorrect[0], incorrect[1], incorrect[2]);
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String[] getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(String[] incorrect) {
        this.incorrect = incorrect;
    }

}
