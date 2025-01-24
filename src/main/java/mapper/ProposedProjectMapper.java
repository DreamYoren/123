package mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.ProposedProject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProposedProjectMapper extends BaseMapper<ProposedProject> {
    // 继承 BaseMapper，自动拥有常见的 CRUD 操作

}
