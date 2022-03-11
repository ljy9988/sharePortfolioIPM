/*
 * Copyright 2022 33641.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.metier;

import fr.metier.Jour;
import org.junit.jupiter.api.Assertions;

public class JourTest {

    public JourTest() {
    }
    
    @org.junit.jupiter.api.Test
    public void testContructor(){
        Integer numJour = 3;
        Jour j1 = new Jour(numJour);
        
        Integer result = j1.getNoJour();
        Assertions.assertEquals(numJour,result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testToString(){
        Integer numJour = 3;
        Jour j1 = new Jour(numJour);
        
        Assertions.assertEquals(j1.toString(),"Jour "+numJour);
    }
    
    @org.junit.jupiter.api.Test
    public void testEquals(){
        Integer numJour = 3;
        Jour j1 = new Jour(numJour);
        
        Assertions.assertTrue(j1.equals(j1));
    }
}
