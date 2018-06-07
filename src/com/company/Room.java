package com.company;

/* This is the main abstract method for all the rooms. It shares all the attributes and features commmon to all rooms.*/
abstract class Room {

    // constants:
    final static char [ ] directions = {'n', 's','e','w' };

    // instance variables:

    // instance methods:
    public abstract String displayContent (char direction);
}
