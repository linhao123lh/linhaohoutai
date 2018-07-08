package com.teamsking.api.dto.open;

import com.teamsking.domain.entity.open.OpenForum;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OpenForumDtoMapper {

    OpenForumDtoMapper INSTANCE = Mappers.getMapper(OpenForumDtoMapper.class);

    List<OpenForumDto> entityListToDtoList(List<OpenForum> entityList);

    OpenForumDto entityToDto(OpenForum openForum);

    OpenForum dtoToEntity(OpenForumDto openForumDto);

}
