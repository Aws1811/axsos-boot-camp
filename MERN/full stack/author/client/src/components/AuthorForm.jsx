import Box from "@mui/material/Box";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import TextField from "@mui/material/TextField";
import InputText from "./InputText";
import { useState } from "react";

const AuthorForm = (props) => {
    const { handelSubmit, error, initialName = "", onCancel } = props;
    const [name, setName] = useState(initialName);
    return (
        <form onSubmit={(e) => handelSubmit(e, { name })}>
            {error ? <Typography color="error">{error}</Typography> : null}
            <Box sx={{ m: 2 }}>
                <InputText
                    id="name"
                    name="name"
                    label="name"
                    onChange={(e) => setName(e.target.value)}
                    value={name}
                    isError={name.length < 3}
                />
            </Box>
            <Button
                type="button"
                variant="outlined"
                onClick={onCancel}
                sx={{ mr: 1 }}
            >
                Cancel
            </Button>
            <Button type="submit" variant="contained" color="success">
                {" "}
                Submit
            </Button>
        </form>
    );
};
export default AuthorForm;
