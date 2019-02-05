package com.test.client;

import com.test.shared.Shared;

public class Client {
    private Shared shared = new Shared();

    public void print() {
        // Im a comment - visible only in the Client Source.
        System.out.println("Client");
        shared.print();
    }
}
