package com.lib.domain.sub;

import com.lib.domain.Domain;

/**
 * @author anu
 *
 */
public class LibUser extends Domain{
		
		private String name;
		private String adress;
		private int pno;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getPno() {
			return pno;
		}
		public void setPno(int pno) {
			this.pno = pno;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("LibUser [name=");
			builder.append(name);
			builder.append(", adress=");
			builder.append(adress);
			builder.append(", pno=");
			builder.append(pno);
			builder.append("]");
			return builder.toString();
		}
		
		
}	