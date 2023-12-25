
package com.mycompany.q0012;

class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

class SubclassException extends BaseException {
    public SubclassException(String message) {
        super(message);
    }
}
