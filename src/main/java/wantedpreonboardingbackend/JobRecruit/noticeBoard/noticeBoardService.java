package wantedpreonboardingbackend.JobRecruit.noticeBoard;

import wantedpreonboardingbackend.JobRecruit.domain.Enterprise;
import wantedpreonboardingbackend.JobRecruit.domain.Notice;

import java.util.List;

public interface noticeBoardService {

    public void register(Notice notice);
    public void update(Notice notice);
    public Notice get(Long nt_id);
    public List<Notice> getAll();
    public List<Notice> getByEnterprise(Long ep_id);
    public List<Notice> getByRegion(String nt_region);
    public List<Notice> getByPostion(String nt_position);
    public List<Notice> getBySkill(String nt_skill);
    public void delete(Long nt_id);
}
