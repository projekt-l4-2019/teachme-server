package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.OpinionEntity;
import pl.example.repository.OpinionRepository;
import pl.example.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpinionService {



    @Autowired
    private OpinionRepository opinionRepository;
    @Autowired
    private UserRepository userRepository;

    public List<OpinionEntity> getAllOpinion() {
        List<OpinionEntity> opinion = new ArrayList<>();
        opinionRepository.findAll().forEach(opinion::add);
        for(OpinionEntity op: opinion)
        {
            op.getUserrByUserFrom().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            op.getUserrByUserTo().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            op.getUserrByUserTo().setLogin(null);
            op.getUserrByUserTo().setPassword(null);
            op.getUserrByUserFrom().setLogin(null);
            op.getUserrByUserFrom().setPassword(null);

            op.getUserrByUserFrom().setNoticesByIdUser(null);
            op.getUserrByUserTo().setNoticesByIdUser(null);

            op.getUserrByUserFrom().setOpinionsByIdUser(null);
            op.getUserrByUserFrom().setOpinionsByIdUser_0(null);
            op.getUserrByUserTo().setOpinionsByIdUser(null);
            op.getUserrByUserTo().setOpinionsByIdUser_0(null);
        }
        return opinion;
    }

    public OpinionEntity getOpinion(Integer id) {
        OpinionEntity opinion = opinionRepository.findById(id).get();
        opinion.getUserrByUserFrom().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
        opinion.getUserrByUserTo().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);

        opinion.getUserrByUserTo().setLogin(null);
        opinion.getUserrByUserTo().setPassword(null);
        opinion.getUserrByUserFrom().setLogin(null);
        opinion.getUserrByUserFrom().setPassword(null);

        opinion.getUserrByUserFrom().setNoticesByIdUser(null);
        opinion.getUserrByUserTo().setNoticesByIdUser(null);

        opinion.getUserrByUserFrom().setOpinionsByIdUser(null);
        opinion.getUserrByUserFrom().setOpinionsByIdUser_0(null);
        opinion.getUserrByUserTo().setOpinionsByIdUser(null);
        opinion.getUserrByUserTo().setOpinionsByIdUser_0(null);

        return opinionRepository.findById(id).get();
    }

    public void addOpinion(OpinionEntity notice) {
        opinionRepository.save(notice);
    }


    public void updateOpinion(Integer id, OpinionEntity notice) {
        opinionRepository.save(notice);
    }


    public void deleteOpinion(Integer id) {
        opinionRepository.deleteById(id);
    }
}
