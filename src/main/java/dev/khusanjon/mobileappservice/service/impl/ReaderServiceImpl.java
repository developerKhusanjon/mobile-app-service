package dev.khusanjon.mobileappservice.service.impl;

import dev.khusanjon.mobileappservice.model.dto.ReaderDto;
import dev.khusanjon.mobileappservice.model.entity.ReaderEntity;
import dev.khusanjon.mobileappservice.repository.ReaderRepository;
import dev.khusanjon.mobileappservice.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReaderServiceImpl implements ReaderService {

    private final ReaderRepository readerRepository;

    @Override
    public ReaderDto createReader(ReaderDto readerDto) {
        ReaderEntity readerEntity = new ReaderEntity();
        BeanUtils.copyProperties(readerDto,readerEntity);

        readerEntity.setReaderId("testId");
        readerEntity.setEncryptedPassword("test");

        ReaderEntity savedReader = readerRepository.save(readerEntity);

        ReaderDto savedDto = new ReaderDto();
        BeanUtils.copyProperties(savedReader,savedDto);

        return savedDto;
    }
}
