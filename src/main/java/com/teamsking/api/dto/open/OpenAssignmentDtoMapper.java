package com.teamsking.api.dto.open;

import com.teamsking.domain.entity.open.OpenAssignment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
*@author linhao
*/
@Mapper
public interface OpenAssignmentDtoMapper {

    OpenAssignmentDtoMapper INSTANCE = Mappers.getMapper(OpenAssignmentDtoMapper.class);

    List<OpenAssignmentDto> entityListToDtoList(List<OpenAssignment> entityList);

    OpenAssignmentDto entityToDto(OpenAssignment openAssignment);

    OpenAssignment dtoToEntity(OpenAssignmentDto openAssignmentDto);

}
