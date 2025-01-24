package controller;

import entity.ProposedProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import service.ProjectService;
import VO.IndustryCategoryVO;

@RestController
@RequestMapping("/projects")
public class ProposedProjectController {
    @Autowired
    private ProjectService projectService;




}

