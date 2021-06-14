package dev.khusanjon.mobileappservice.controller;

import dev.khusanjon.mobileappservice.model.dto.ReaderDto;
import dev.khusanjon.mobileappservice.model.request.ReaderRequest;
import dev.khusanjon.mobileappservice.model.response.ReaderRest;
import dev.khusanjon.mobileappservice.service.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderService readerService;

    @GetMapping
    public String getReaderCredential(){
        return "Reader ID and name";
    }

    @PostMapping
    public ReaderRest createReaderCredential(@RequestBody ReaderRequest readerRequest){
        ReaderRest readerRest = new ReaderRest();

        ReaderDto readerDto = new ReaderDto();
        BeanUtils.copyProperties(readerRequest,readerDto);
        ReaderDto createdReader = readerService.createReader(readerDto);
        BeanUtils.copyProperties(createdReader,readerRest);

        return readerRest;
    }

    @PutMapping
    public String updateReaderCredential(){
        return "Reader creds updated!";
    }

    @DeleteMapping
    public String deleteReaderCredential(){
        return "Reader creds deleted!";
    }
}
