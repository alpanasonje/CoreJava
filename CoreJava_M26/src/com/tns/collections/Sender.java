package com.tns.collections;

public class Sender<T>{
private T message;
public void setMessage(T message) {
this.message = message;
}
public void sendMessage() {
System.out.println(message);
}
}