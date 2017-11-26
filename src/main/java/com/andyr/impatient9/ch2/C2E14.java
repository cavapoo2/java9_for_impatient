package com.andyr.impatient9.ch2;

import java.util.ArrayList;
import java.util.List;

public class C2E14 {
    public static void main(String[] args) {
        //create some members
        Network network = new Network();
        Network.Member m1 = network.enroll("Jim");
        Network.Member m2 = network.enroll("Andy");
        Network.Member m3 = network.enroll("Wendy");
        Network.Member m4 = network.enroll("Jane");
        Network.Member m5 = network.enroll("Peter");
        System.out.println("Members are:");
        network.showMembers();
        network.unenroll(m4);
        System.out.println("Members are:");
        network.showMembers();
        m5.deactivate();
        System.out.println("Members are:");
        network.showMembers();
    }

}
class Network {
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }
        public String getName() { return name;}

        public void deactivate() {
            members.remove(this);
        }
    }
    //seems a bit naff returning a Member.
    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member m) {
        members.remove(m);

    }
    //ideally it would be an id not name
    public ArrayList<Member> getMembersByName(String name) {
        ArrayList<Member> result = new ArrayList<Member>();
        members.forEach(m -> {
            if (m.getName().equals(name))
                result.add(m);
        });
        return result;

    }
    public void showMembers() {
        members.forEach(m -> System.out.println(m.getName()));
    }

    private ArrayList<Member> members = new ArrayList<>();

}
