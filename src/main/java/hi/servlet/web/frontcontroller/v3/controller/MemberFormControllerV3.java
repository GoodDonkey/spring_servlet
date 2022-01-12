package hi.servlet.web.frontcontroller.v3.controller;

import hi.servlet.web.frontcontroller.ModelView;
import hi.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form"); // 논리 이름만 넣는다.
    }
}
