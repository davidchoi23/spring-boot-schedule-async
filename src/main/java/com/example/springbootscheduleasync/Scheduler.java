package com.example.springbootscheduleasync;


import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Scheduler {

  //@Async
  @Scheduled(fixedDelay = 2000)
  public void cronJob01() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String strDate = sdf.format(now);

    log.debug("cronJob01 Start : {}", strDate);
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    log.debug("cronJob01 End : {}", strDate);

  }


  //@Async
  @Scheduled(fixedDelay = 1000)
  public void cronJob02() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String strDate = sdf.format(now);

    log.debug("cronJob02 Start : {}", strDate);
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    log.debug("cronJob02 End : {}", strDate);

  }
}
