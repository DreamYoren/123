package service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.IndustryCategory;
import entity.IndustryCategoryRespVO;
import entity.PageResultIndustryCategoryRespVO;
import jakarta.annotation.Resource;
import mapper.IndustryCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class IndustryCategoryServiceImpl extends ServiceImpl<IndustryCategoryMapper, IndustryCategory> implements service.impl.IndustryCategoryService {

    @Resource
    private IndustryCategoryMapper industryCategoryMapper;

    @Override
    public boolean createIndustryCategory(IndustryCategory industryCategory){
        int result = industryCategoryMapper.insert(industryCategory);
        return result > 0;
    }

    @Override
    public boolean updateIndustryCategory(IndustryCategory industryCategory) {
        int result = industryCategoryMapper.updateById(industryCategory);
        return result > 0;
    }

    @Override
    public boolean deleteIndustryCategory(Integer id) {
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setId(id);
        industryCategory.setDeleted(true);
        int result = industryCategoryMapper.updateById(industryCategory);
        return result > 0;
    }

    @Override
    public IndustryCategory getIndustryCategoryById(Integer id) {
        return industryCategoryMapper.selectById(id);
    }

    @Override
    public PageResultIndustryCategoryRespVO listIndustryCategoryWithPage(int currentPage, int pageSize) {
        Page<IndustryCategory> page = new Page<>(currentPage, pageSize);
        industryCategoryMapper.selectPage(page , new QueryWrapper<IndustryCategory>().eq("deleted",false));
        PageResultIndustryCategoryRespVO resultVO = new PageResultIndustryCategoryRespVO();
        resultVO.setTotal((int) page.getTotal());
        resultVO.setList(page.getRecords().stream().map(this::convertToRespVO).collect(Collectors.toList()));
        return resultVO;
    }

    private IndustryCategoryRespVO convertToRespVO(IndustryCategory industryCategory) {
        IndustryCategoryRespVO respVO = new IndustryCategoryRespVO();
        respVO.setId(industryCategory.getId());
        respVO.setName(industryCategory.getName());
        respVO.setCreateTime(industryCategory.getCreate_time());
        return respVO;
    }


}
