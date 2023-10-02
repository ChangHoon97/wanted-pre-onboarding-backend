package wantedpreonboardingbackend.JobRecruit.noticeBoard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import wantedpreonboardingbackend.JobRecruit.domain.Enterprise;

@Controller
public class noticeBoardController {
    private Enterprise enterprise;

    @PostMapping
    public String register(Model model){
        model.addAttribute("enterprise_id", enterprise.getEnterprise_id());

        return "";
    }

    @PatchMapping
    public String update(Model model){

        return "";
    }
}
