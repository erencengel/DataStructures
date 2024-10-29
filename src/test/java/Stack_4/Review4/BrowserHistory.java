package Stack_4.Review4;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    /**
     * leetcode
     * Design Browser History Problem
     * Problem No 1472
     */

    Deque<String> history, forwardStack;
    String currentPage;

    public BrowserHistory(String homepage) {
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homepage;
    }

    public void visit(String url) {
        history.push(currentPage);
        System.out.println(url + " is visited");
        currentPage = url;
        forwardStack = new ArrayDeque<>();
    }

    public String back(int steps) {
        int stepNumber = steps;
        while (steps > 0 && !history.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = history.pop();
            steps--;
        }
        System.out.println("back operation of " + stepNumber + " brings " + currentPage + " as current page");
        return currentPage;
    }

    public String forward(int steps) {
        int stepNumber = steps;
        while (steps > 0 && !forwardStack.isEmpty()) {
            history.push(currentPage);
            currentPage = forwardStack.pop();
            steps--;
        }
        System.out.println("forward operation of " + stepNumber + " brings " + currentPage + " as current page");
        return currentPage;
    }

}

