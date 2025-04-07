package org.gemoc.ql.k3based.addons.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UserInputChangeNotifier {

    private final Lock lock = new ReentrantLock();
    private final Condition changeReceived = lock.newCondition();
    private volatile boolean inputChanged = false;

    public void onUserInputChanges() {
        lock.lock();
        try {
            inputChanged = true;
            changeReceived.signal();
        } finally {
            lock.unlock();
        }
    }

    public void waitForInputChange() throws InterruptedException {
        lock.lock();
        try {
            while (!inputChanged) {
                changeReceived.await();
            }
            inputChanged = false;
        } finally {
            lock.unlock();
        }
    }
}
