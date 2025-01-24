package service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import entity.ProposedProject;

public interface ProjectService {
    Page<ProposedProject> listProposedProjectsWithPage(int currentPage,int pageSize);
    boolean saveProposedProject(ProposedProject proposedProject);
    boolean updateProposedProject(ProposedProject proposedProject);
    boolean deleteProposedProject(ProposedProject proposedProject);
    ProposedProject getProposedProjectById(int id);
}