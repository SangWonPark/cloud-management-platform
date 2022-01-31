package memberapi.member.service.conc;

import memberapi.member.model.entity.UserOld;
import memberapi.member.service.AbstractMemberService;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author agj017@gmail.com
 * @since 2021/10/21
 */
public class UserConcreateService extends AbstractMemberService<UserOld> {

    public UserConcreateService(JpaRepository<UserOld, Long> repo) {
        super(repo);
    }

    @Override
    protected Long putMemberInfo(UserOld member) {
        return null;
    }

}
