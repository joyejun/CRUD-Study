package com.sprint.mission;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository implements IRepository{

    private Map<Integer, Member> membermap = new HashMap<>();

    @Override
    public void create(Member id) {
        if(! this.membermap.isEmpty() && this.membermap.containsKey(id.getId())) {
            throw new RuntimeException("만드시려는 아이디는 이미 존재하거나 비어있지 않습니다."+ id);
        }
        membermap.put(id.getId(), id);
        System.out.println("회원가입 완료 :"+id );
    }

    @Override
    public void read(Member id) {
        if(!this.membermap.containsKey(id.getId())) {
            throw new RuntimeException("읽으시려는 회원정보가 없습니다."+ id);
        }
        System.out.println("----읽으시려는 회원 id를 찾았습니다.----");
        this.membermap.containsKey(id.getId());
    }

    @Override
    public void delete(Member id) {
        if(this.membermap.isEmpty()) {
            throw new RuntimeException("삭제하려는 아이디가 없습니다."+ id);
        }
        System.out.println("----아이디를 삭제했습니다.----"+ id);
        membermap.remove(id.getId(), id);

    }

    @Override
    public void update(Member id) {
        if(this.membermap.isEmpty()){
            throw new RuntimeException("업데이트 하려는 아이디가 없습니다."+ id)
        }
        System.out.println("----아이디를 업데이트습니다.----"+ id);
        this.membermap.containsKey(id.getId());

    }
}
