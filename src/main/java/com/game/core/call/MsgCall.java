package com.game.core.call;

import com.game.core.Call;
import com.game.core.HumanObject;

public class MsgCall {
    private Call call;
    private HumanObject humanObj;


    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public HumanObject getHumanObj() {
        return humanObj;
    }

    public void setHumanObj(HumanObject humanObj) {
        this.humanObj = humanObj;
    }
}