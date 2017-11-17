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

import jolie.runtime.Value;

/**
 *
 * @author maschio
 */
public class LogMessage {
    private LoggerLevel loggerLevel;
    private Value data;
    private String errorCode = null;
    
    public void LogMessage (LoggerLevel loggerLevel, Value data ){
      this.loggerLevel = loggerLevel;
      this.data = data;
    
    }
    
    public void LogMessage (LoggerLevel loggerLevel, Value data , String errorCode){
      this.loggerLevel = loggerLevel;
      this.data = data;
      this.errorCode = errorCode;
    
    }
    
    public void setLoggerLevel (LoggerLevel loggerLevel){
      this.loggerLevel = loggerLevel;
    }
    public LoggerLevel getLoggerLevel (){
       return this.loggerLevel;
    }
    
    public boolean hasErrorCode (){
      if (errorCode == null){
        return false;
      } else{
        return true;
      }
    } 
    
   public void setErrorCode(String errorCode){
       this.errorCode = errorCode;
   }
    
   public String getErrorCode (){
      return this.errorCode;
    } 
    
    public Value getData(){
      return this.data;
    } 
    
    public void setData(Value data){
      this.data = data;
    } 
      
          
    
}
