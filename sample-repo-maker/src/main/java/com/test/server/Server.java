package com.test.server;

import com.test.shared.Shared;


public class Server {
    private Shared shared = new Shared();

    public void print() {
        // Im a comment - visible only in the Server Source.
        System.out.println("Server");
        shared.print();
    }
}
