package service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.IndustryCategory;
import entity.IndustryCategoryRespVO;
import entity.PageResultIndustryCategoryRespVO;
import jakarta.annotation.Resource;
import mapper.IndustryCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IndustryCategoryService;

import java.util.stream.Collectors;

@Service
public class IndustryCategoryServiceImpl extends ServiceImpl<IndustryCategoryMapper, IndustryCategory> implements IndustryCategoryService {

    @Autowired
    private IndustryCategoryMapper industryCategoryMapper;

    @Override
    public boolean createIndustryCategory(IndustryCategory industryCategory){
        return this.save(industryCategory);
    }

    @Override
    public boolean updateIndustryCategory(IndustryCategory industryCategory) {
       return this.updateById(industryCategory);
    }

    @Override
    public boolean deleteIndustryCategory(Integer id) {
        return this.removeById(id);
    }

    @Override
    public IndustryCategory getIndustryCategoryById(Integer id) {
        return this.getById(id);
    }

    @Override
    public Page<IndustryCategory> getPage(int currentPage, int pageSize) {
        Page<IndustryCategory> page = new Page<>(currentPage, pageSize);
        return this.page(page);
    }




}
