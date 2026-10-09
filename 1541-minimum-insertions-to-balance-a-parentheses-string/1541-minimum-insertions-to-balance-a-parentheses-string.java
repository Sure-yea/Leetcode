class Solution {

    
    public int minInsertions(String s) {
        
        ArrayList<Character> stack =new ArrayList<>();
        ArrayList<String> buffer =new ArrayList<>();
        int insert=0;
        int i=0;
        while(i<s.length()){            
            if(s.charAt(i)=='('){        //is opening
                stack.add(s.charAt(i));   //add it to stack
                i++;
                
            }
            else if(s.charAt(i)==')'){      //is closing
                
                if(i==s.length()-1){           //if it's last
                    insert+=1;                    // make it double closing

                                                    // remove its opening saathi
                    if(stack.size()==0){              //if nothing to remove
                        insert++;                    // make one so we can remove
                        stack.add('(');

                    }
                    stack.remove(stack.size()-1);   
                    break;                            //string khtm toh break
                }

                if(s.charAt(i+1)==')'){       //double closing

                                                    // remove its opening saathi
                    if(stack.size()==0){              //if nothing to remove
                        insert++;                    // make one so we can remove
                        stack.add('(');
                        
                    }
                    stack.remove(stack.size()-1);
                    i+=2;
                }

                else if(s.charAt(i+1)=='('){
                    insert++;
                    
                                                    // remove its opening saathi
                    if(stack.size()==0){              //if nothing to remove
                        insert++;                    // make one so we can remove
                        stack.add('(');
                        
                    }
                    stack.remove(stack.size()-1);
                    
                    i++;
                }
            }
            
        }
        System.out.println(insert+"+"+stack.size()*2);
        return insert+stack.size()*2;
    }
}