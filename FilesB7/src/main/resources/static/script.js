const API_URL = '/api/files'
async function loadFiles() {
        const res = await fetch(API_URL);
        const files = await res.json();
        const listElement = document.getElementById('fileList');

        if (files.length === 0) {
            listElement.innerHTML = "Nenhum arquivo encontrado.";
            return;
        }

        listElement.innerHTML = files.map(file => `
            <div class="file-item">
                <div class="file-info">
                    <strong>${file.originalName}</strong><br>
                    ${(file.size / 1024 / 1024).toFixed(2)} MB
                </div>
                <a href="${API_URL}/download/${file.id}" target="_blank">Baixar</a>
            </div>
        `).join('');
    }

async function upload() {
        const fileInput = document.getElementById('fileInput');
        const btn = document.getElementById('uploadBtn');

        if (fileInput.files.length === 0) {
            alert("Selecione um arquivo primeiro!");
            return;
        }

        const formData = new FormData();
        formData.append('file', fileInput.files[0]);

        btn.disabled = true;
        btn.innerText = "Enviando...";

        try {
            const res = await fetch(`${API_URL}/upload`, {
                method: 'POST',
                body: formData
            });

            if (res.ok == false) {
                alert("Erro no upload.");
            } else{
                alert("Sucesso!");
                fileInput.value = '';
                loadFiles();
            }
        } catch (e) {
            alert("Erro de conexão.");
        } finally {
            btn.disabled = false;
            btn.innerText = "Enviar para o PC";
        }
    }

loadFiles();