/*
 * Copyright (C) 2017 maschio.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package logger;

import java.util.LinkedList;

/**
 *
 * @author maschio
 */
public abstract class AbstractLogger {
    
  private LinkedList<LogMessage> severeList  = new LinkedList<>();
  private LinkedList<LogMessage> warningList = new LinkedList<>();  
  private LinkedList<LogMessage> traceList = new LinkedList<>();  
  
  
  protected abstract void writeLogger(LogMessage l);
  public void logSevere(LogMessage l){
       writeLogger(l);
  };
  public void logWarning (LogMessage l){
       writeLogger(l);
  };
  public void logTrace (LogMessage l){
       writeLogger(l);
  };;
  public void pushLog (LogMessage l){
       if ( l.getLoggerLevel()== LoggerLevel.SEVERE){
             severeList.push(l);
           }
       if ( l.getLoggerLevel()== LoggerLevel.WARNING){
             warningList.push(l);
           }
  
  };
  public void flushSevere(){
       for (int counter =0 ; counter < severeList.size(); counter++){
          writeLogger(severeList.get(counter));
      }
      severeList = new LinkedList<>();
  }
  
 
  public void flushWarning(){
         for (int counter =0 ; counter < warningList.size(); counter++){
            writeLogger(warningList.get(counter));
          }
          severeList = new LinkedList<>();
  };
  public  void flushTrace(){
      for (int counter =0 ; counter < traceList.size(); counter++){
          writeLogger(traceList.get(counter));
      }
      traceList = new LinkedList<>();
  };
}
