package ru.otus.ATMDepartment;

import java.util.ArrayDeque;
import java.util.Deque;

class Originator {
    private final Deque<Memento> stack = new ArrayDeque<>();

   public void saveState(State state) {
        stack.push(new Memento(state));
    }

    public State restoreState() {
        return stack.pop().getState();
    }
}
