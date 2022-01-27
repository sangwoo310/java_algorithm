package com.hsw.algorithm.codeTestDom;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

/*
    public boolean canBeConnected(Friend friend) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");

        for (Friend f: this.friends) {
            if(f.getEmail().equals(friend.getEmail())) {
                return true;
            }

            return canBeConnected(f);
        }

        return false;
    }
*/

    public boolean canBeConnected(Friend friend) {
        HashSet<Friend> check = new HashSet<Friend>();
        Stack<Friend> stack = new Stack<Friend>();
        stack.push(this);

        while (!stack.empty()) {
            Friend fri = stack.pop();
            if(check.contains(fri)) {
                continue;
            }

            check.add(fri);
            if (fri == friend) {
                return true;
            }

            for (Friend f : fri.getFriends()) {
                if (!check.contains(f))
                    stack.push(f);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("D");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(d));
    }
}