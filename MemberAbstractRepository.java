package com.sprint.mission;

import java.util.HashMap;
import java.util.Map;

public abstract class MemberAbstractRepository implements IRepository{

    private final Map<Integer, Member> membermap = new HashMap<>();

    public Map<Integer, Member> getMembermap() {
        return this.membermap;
    }
}
