/*
* Copyright 2011 Objectos, Fábrica de Software LTDA.
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/
package br.com.objectos.dojo.taguiar;

import java.util.List;

import com.google.sitebricks.Show;

/**
 * @author tiago.aguiar@objectos.com.br (Tiago Aguiar)
 */
@Show("TabelaDeAluno.html")
public class TabelaDeAluno {

  private final List<ConsultaDeAlunoDTO> dtos;

  public TabelaDeAluno(List<ConsultaDeAlunoDTO> dtos) {
    this.dtos = dtos;
  }

  public List<ConsultaDeAlunoDTO> getDtos() {
    return dtos;
  }

}