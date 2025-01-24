package service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import entity.ProposedProject;
import mapper.ProposedProjectMapper;
import org.springframework.stereotype.Service;
import service.ProjectService;

@Service
public class ProposedProjectServiceImpl implements ProjectService {
    private final ProposedProjectMapper proposedProjectMapper;
    public ProposedProjectServiceImpl(ProposedProjectMapper proposedProjectMapper) {
        this.proposedProjectMapper = proposedProjectMapper;
    }


    @Override
    public Page<ProposedProject> listProposedProjectsWithPage(int currentPage, int pageSize) {
        Page<ProposedProject> page = new Page<>(currentPage, pageSize);
        QueryWrapper<ProposedProject> queryWrapper = new QueryWrapper<>();

        return proposedProjectMapper.selectPage(page, queryWrapper);
    }

    @Override
    public boolean saveProposedProject(ProposedProject proposedProject) {

        return proposedProjectMapper.insert(proposedProject) > 0;
    }

    @Override
    public boolean updateProposedProject(ProposedProject proposedProject) {
        return proposedProjectMapper.updateById(proposedProject) > 0;
    }

    @Override
    public boolean deleteProposedProject(ProposedProject proposedProject) {
        return proposedProjectMapper.deleteById(proposedProject) > 0;
    }

    @Override
    public ProposedProject getProposedProjectById(int id) {
        return proposedProjectMapper.selectById(id);
    }
}
