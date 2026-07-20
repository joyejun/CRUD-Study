package com.sprint.mission;

public class DemoApplication {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();

        Member member1 = new Member(1,"arron",21,"olive1600@naver.com");
        Member member2 = new Member(2,"brron",22,"olive1601@naver.com");
        Member member3 = new Member(3,"crron",23,"olive1602@naver.com");

         memberRepository.create(member1);
         memberRepository.read(member1);
         memberRepository.update(1, 4);
         memberRepository.read(member1);


         memberRepository.create(member2);
         memberRepository.delete(member1);







    }
}
